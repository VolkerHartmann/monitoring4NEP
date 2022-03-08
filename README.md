# Monitoring for NEP

[![Build Status](https://github.com/kit-data-manager/monitoring4nep/actions/workflows/gradle.yml/badge.svg)](https://github.com/kit-data-manager/monitoring4nep/actions/workflows/gradle.yml)
[![CodeQL](https://github.com/kit-data-manager/monitoring4nep/actions/workflows/codeql-analysis.yml/badge.svg)](https://github.com/kit-data-manager/monitoring4nep/actions/workflows/codeql-analysis.yml)
![License](https://img.shields.io/github/license/kit-data-manager/monitoring4nep.svg)

Enable monitoring for NEP via logging appender. 
 
## Installation
1. [Install MetaStore repository](https://github.com/kit-data-manager/metastore2#installation)
2. Build library 
3. Copy library to subfolder 'lib' of MetaStore installation directory.
4. Add 'logback-spring.xml' to MetaStore installation directory.

### Installation
#### Clone repository
First of all you'll have to clone this repository:
```
user@localhost:/home/user/$ git clone https://github.com/kit-data-manager/monitoring4nep.git
Clone to 'monitoring4nep'
[...]
user@localhost:/home/user/$ cd monitoring4nep
user@localhost:/home/user/monitoring4nep$
```

#### Build library
Now you'll have to build the library.

```
user@localhost:/home/user/monitoring4nep$ ./gradlew clean build
[...]
user@localhost:/home/user/monitoring4nep$
```
The library should be available in folder 'build/libs'.

#### Customize settings
ToDo 

## More Information

* [Information about KIT Data Manager 2](https://github.com/kit-data-manager/base-repo)
* [REST Documentation MetaStore2](restDocu.md) 

## License

The MetaStore2 is licensed under the Apache License, Version 2.0.
