# Try Ktor

Prima prova di utilizzo di ktor.

## Copyright



## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.
See deployment for notes on how to deploy the project on a live system.

### WIKI



### Prerequisites

What things you need to install the software and how to install them

**Backend**
```
* JDK8
* sbt version 
* NodeJS version >= 14
```

**Frontend**
```
```


## Running the application

### Backend

**Prerequisite**

Create a database with:
```properties
database_name=""
username=""
password=""
```
A script can be this:
```properties
```

An _alternative_ way can be using a new **Docker** machine, a script:
```cmd

```


**Running**

In order to run the backend on a developer machine go to the root folder

Script
``` shell

```

The Backend will be served on  http://localhost:

Opening this page without error will create the tables in the database.


### Frontend

In order to run the frontend on a developer machine you need to be authenticated with the TBG private NPM registry `ui-components`

**Setup of the private registry**

```bash
```


```bash
```

**Running the frontend**

To run the frontend enter inside the `client` directory and launch it with

```bash
```

The frontend will be served on http://localhost:


**Mocking API**

The `mocks` configuration is written in the file:

```bash
client/src/mocks/browser.ts
```

**Mocks are not enabled by default, to enable them launche the frontend with a specific `environment`**:

```bash
```


## Running the tests

Explain how to run the automated tests for this system

### Break down into end to end tests

Explain what these tests test and why

```
Give an example or link a international standard
```


## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Playframework](https://www.playframework.com/) - The web framework used
* [SBT](https://www.scala-sbt.org/) - Dependency Management

## Contributing

Our code of conduct and how to contribute in this projects.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags].

## Release Roadmap
* 1.0.0 **Platform test alpha** Permette di modificare lo scenario e usare il motore di simulazione _06/10/2021_
* 1.0.0 **Platform test update** Aggiornamento piattaforma di test _20/10/2021_
* 2.0.0 **Player UX** Versione grafica del client _17/11/2021_
* 3.0.0 **Beta** Test completi e ultime verifiche _01/12/2021_
* 3.?.0 **Final release** Rilascio finale in produzione  _15/12/2021_

## Authors

* **Luca Capitoli** - *Initial work, Back-end, API implementation* -

## License

This project is licensed under the Proprietary License - see the [LICENSE.md](LICENSE.md) file for details

