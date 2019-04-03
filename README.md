# DrawingBoard

Drawingboard is the console application for #terminal lovers to draw things on console. Hit the diffrent commands and enjoy the drawing. :-)


## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project and draw things.

### Prerequisites

* Linux _(or any other OS where java can be installed)_
* Java 8
* Maven

### DrawingBoard built on

**System Info :-**

```
System:    Kernel: 4.15.0-20-generic x86_64 bits: 64 Desktop: Cinnamon 3.8.8
           Distro: Linux Mint 19 Tara
Machine:   System: Dell product: Dell System XPS L502X
           Mobo: Dell model: 0MY6GN v: A00 UEFI [Legacy]: Dell v: A05 date: 05/04/2011
CPU:       Quad core Intel Core i7-2630QM (-MT-MCP-) cache: 6144 KB
           clock speeds: max: 2900 MHz 1: 798 MHz 2: 798 MHz 3: 798 MHz 4: 798 MHz 5: 798 MHz 6: 798 MHz
           7: 798 MHz 8: 798 MHz
Graphics:  Card-1: Intel 2nd Generation Core Processor Family Integrated Graphics Controller
           Card-2: NVIDIA GF108M [GeForce GT 540M]
           Display Server: x11 (X.Org 1.19.6 ) drivers: modesetting,nouveau (unloaded: fbdev,vesa)
           Resolution: 1366x768@59.64hz, 1280x1024@60.02hz
           OpenGL: renderer: Mesa DRI Intel Sandybridge Mobile version: 3.3 Mesa 18.0.0-rc5
Drives:    HDD Total Size: 240.1GB (37.8% used)
           ID-1: /dev/mmcblk0 model: N/A size: 4.0GB
           ID-2: /dev/sda model: INTEL_SSDSC2BW24 size: 240.1GB
Partition: ID-1: / size: 103G used: 75G (77%) fs: ext4 dev: /dev/sda6
           ID-2: swap-1 size: 8.00GB used: 0.00GB (0%) fs: swap dev: /dev/sda5
```
**Java :-**

```
Apache Maven 3.5.4 (1edded0938998edf8bf061f1ceb3cfdeccf443fe; 2018-06-18T00:03:14+05:30)
Maven home: /usr/lib/maven/apache-maven-3.5.4
Java version: 1.8.0_181, vendor: Oracle Corporation, runtime: /usr/lib/jvm/jdk1.8.0_181/jre
Default locale: en_IN, platform encoding: UTF-8
OS name: "linux", version: "4.15.0-20-generic", arch: "amd64", family: "unix"

```

### Installing & Running App

```
unzip DrawingBoard.zip
cd drawingboard
mvn exec:java

```
and thats it, your app will be up and running. use below commands to use app.

```
Command 		Description
C w h           Should create a new canvas of width w and height h.
L x1 y1 x2 y2   Should create a new line from (x1,y1) to (x2,y2). Currently only
                horizontal or vertical lines are supported. Horizontal and vertical lines
                will be drawn using the 'x' character.
R x1 y1 x2 y2   Should create a new rectangle, whose upper left corner is (x1,y1) and
                lower right corner is (x2,y2). Horizontal and vertical lines will be drawn
                using the 'x' character.
B x y c         Should fill the entire area connected to (x,y) with "colour" c. The
                behaviour of this is the same as that of the "bucket fill" tool in paint
                programs.
Q               Should quit the program.
```

## Running the tests
For shooting everything once. :)
```
mvn clean verify package test spotbugs:check pmd:pmd checkstyle:check javadoc:javadoc
```

### Junit
DrawingBoard have lots of testcases to cover and code coverage is **92.5%**
```
mvn clean verify test
```

### Coding style tests
I'm a contributor to Apache Commons Text and love the checkstyle we use there. I have used same to develop this project.
https://github.com/apache/commons-text

```
mvn clean verify checkstyle:check
```
### Spotbug and pmd
```
mvn clean verify spotbugs:check pmd:pmd
```
### Javadoc
For API documentation.
```
mvn clean verify javadoc:javadoc
```
### Site
Using default site generation by mvn.
```
mvn site:run
```
and point your browser to http://0.0.0.0:8080/, All info, javadoc, Reports at one place :)

## Deployment

Just do ```mvn clean verify package``` in source directory and use the .jar file generated.

## Built With

* [Eclipse](https://www.eclipse.org/) - IDE used
* [Maven](https://maven.apache.org/) - Dependency Management

## Future functionalities.
* some more shapes like circle, rhombus, diagonal line. _(need to study some maths)_
* undo, redo Operations.
* multiple canvas on canvas holder etc.

## Authors

**Amey Jadiye**
* [https://github.com/ameyjadiye](https://github.com/ameyjadiye)
* [https://www.linkedin.com/in/ameyjadiye/](https://www.linkedin.com/in/ameyjadiye/)

## License & Copyright

Copyright © 2019 by Amey Jadiye _(Author)_
Copyright © 1997 - 2019 CREDIT SUISSE GROUP AG and/or its affiliates.

All rights reserved. No part of this code may be reproduced, distributed, or transmitted in any form or by any means, including photocopying, recording, or other electronic or mechanical methods, without the prior written permission of the author.
