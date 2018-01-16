# CryptoCaddy

> todo: write project description

## Getting Started

These instructions will get CryptoCaddy up and running on your local machine for development and testing purposes. Please view the READMEs within this project's subfolders for more specific development instructions.

### Prerequisites

This project uses Docker Compose for its deployment, so you'll need

```
Docker 18.01+
Docker Compose 1.18+
```

### Installing

Clone the repo

```
git clone https://github.com/CryptoCaddy/web-app.git
```

Set the following environment variables in terminal (arbitrary values are fine for testing)

```
MYSQL_DATABASE
MYSQL_USER
MYSQL_PASSWORD
MYSQL_ROOT_PASSWORD
```

Build with docker (run in the project's root directory).

```
docker-compose build
```

## Deployment

Run with Docker
```
docker-compose up -d
```

The server will take 3-5 minutes to fully start up, you can monitor its progress with this command
```
docker logs -f $(docker ps -f name=webapp_web -q)
```

When the following line appears the server has started. Feel free to use CTRL-C to exit the previous command, it will not kill the server.
```
2018-01-16 04:23:33.392  INFO 36 --- [           main] c.c.services.auditing.Application        : Started Application in 49.511 seconds (JVM running for 55.378)
```

CryptoCaddy will now be running on your local machine, you can access it at the ip given by the following command
```
docker-machine ip
```

## Loading changes

When applying changes use the following commands, please note that each component has specialized instructions for developing and testing changes so this should only be done when pulling from the repo or finalizing code changes as it is slow.

```
docker-compose build
docker-compose up -d
```

## Cleanup

Shutdown the website with the following command
```
docker-compose down
```

To completely cleanup the website and delete all data associated with it run
```
docker-compose down -v
```

## Built With

* [Spring Boot Framework](https://spring.io/docs/) - powerful framework to create stand-alone Spring application with production grade features and embedded Tomcat server
* [Maven](https://maven.apache.org/) - Dependency Management
* [Webpack](https://webpack.js.org/) - Frontend build system
* [Docker](https://www.docker.com/) - Container creation, deployment and management system

## Contributing

Please read [CONTRIBUTING.md]() for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

//

## Authors

* **Jon Waggoner** 
* **Nicholas Fields** 

See also the list of [contributors](https://github.com/CryptoCaddy/web-services/contributors) who participated in this project.

## License

This project is licensed under the AGPL-3.0 License - see the [LICENSE.md](https://github.com/CryptoCaddy/web-services/blob/master/LICENSE) file for details

## Acknowledgments

* CryptoCaddy uses the [XChange](https://github.com/timmolter/XChange) repo.
