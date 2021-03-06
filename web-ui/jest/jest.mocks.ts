/**
 * Mock: localStorage, sessionStorage
 */
const mock = () => {
  let storage = { };
  return {
    getItem: key => key in storage ? storage[key] : null,
    setItem: (key, value) => storage[key] = value || '',
    removeItem: key => delete storage[key],
    clear: () => storage = { },
  };
};

Object.defineProperty(window, 'localStorage', { value: mock() });
Object.defineProperty(window, 'sessionStorage', { value: mock() });

/**
 * Mock: requestAnimationFrame, cancelAnimationFrame
 */
Object.defineProperty(window, 'requestAnimationFrame', { value: function(callback) {
  let lastTime = 0;
  const currTime = new Date().getTime();
  const timeToCall = Math.max(0, 16 - (currTime - lastTime));
  const id = window.setTimeout(function() { callback(currTime + timeToCall); },
    timeToCall);
  lastTime = currTime + timeToCall;
  return id;
}});

Object.defineProperty(window, 'cancelAnimationFrame', { value: function(id) {
  clearTimeout(id);
}});

// This fixes the "The provided animation property "transform" is not a supported CSS property for animations" error
// https://github.com/angular/material2/issues/7101
Object.defineProperty(document.body.style, 'transform', {
  value: () => {
    return {
      enumerable: true,
      configurable: true,
    };
  },
});
