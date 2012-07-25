Overview
--------

An example [Alfresco AMP](http://wiki.alfresco.com/wiki/AMP_Files) project to
demonstrate building with [Gradle](http://gradle.org) and the 
[alfresco-gradle-plugins](https://github.com/Alfresco/alfresco-gradle-plugins).

The resulting Share AMP adds an example JSP page that displays a message fetched from
a Java class which reads the text from a properties file and the repository AMP
displays a console message on startup.

While that's useless functionality,
the project ties together many of the possible 
[AMP deployment touch points](http://wiki.alfresco.com/wiki/Developing_an_Alfresco_Module) and 
can serve as a guide or template for your project.

See the [alfresco-gradle-plugins](https://github.com/Alfresco/alfresco-gradle-plugins) project
for full details on use of the plugins.

### Requirements

The project currently requires that Gradle and [Maven](http://maven.apache.org) be installed.

A complied jar of the  
[alfresco-gradle-plugins](https://github.com/Alfresco/alfresco-gradle-plugins) project is included
in `lib-compile` as a buildscript dependency by default, or you can use a version in your local 
Maven repository.


Packaging as an AMP
-------------------

To package the AMP:

	cd alfresco-gradle-amp-example
	gradle amp
		
The packaged AMPs will be available at `my-example-repo/build/distributions/my-example-repo-0.1.0.amp`
and `my-example-share/build/distributions/my-example-share-0.1.0.amp`.


Running Tests
-------------

To run the unit tests:

	gradle test
		
and see the results with:

	open my-example-repo/build/reports/tests/index.html

and

	open my-example-share/build/reports/tests/index.html 



Installing the AMP
------------------

	gradle installAmp -PwarFile=/Path/To/WAR/File


Viewing the Example
-------------------

The endpoint depends on your environment and where you've installed the AMP but 
here's an example URL:

	http://localhost:8080/share/jsp/example.jsp

	
License
-------

Copyright (C) 2005-2012 Alfresco Software Limited.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
