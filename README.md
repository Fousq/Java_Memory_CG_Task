# Java_Memory_CG_Task

## Source Links

Articles:

* <a href="https://www.youtube.com/watch?v=JbLClSMRK_I">[Ru] JVM, краткий курс общей анатомии</a>
* <a href="https://www.youtube.com/watch?v=EMXflWb9Z5w">[Ru] Что нового в JVM 8</a>
* <a href="https://plumbr.eu/java-garbage-collection-handbook">GC Handbook</a>
* <a href="https://habrahabr.ru/company/luxoft/blog/174231/">Грустная история тюнинга из 2013</a>

Official docs:

* <a href="http://www.oracle.com/technetwork/articles/java/vmoptions-jsp-140102.html">Java HotSpot VM Options</a>
* <a href="https://docs.oracle.com/javase/8/docs/technotes/guides/vm/">Java Virtual Machine Technology </a>

Video:

* <a href="https://drive.google.com/drive/folders/1e_AG0l9HOdg5r4w31GT-oXK931ixkpBt">https://drive.google.com/drive/folders/1e_AG0l9HOdg5r4w31GT-oXK931ixkpBt</a>

Books:

* <a href="https://www.amazon.com/Java-Performance-Definitive-Guide-Getting/dp/1449358454">Java Performance: The Definitive Guide: Getting the Most Out of Your Code</a>

## Task

Description.

Task 4. (15 points) Classloading

* Create a new abstract class (or interface) Animal with methods: "Play", "Voice".
* Inherit Cat and Dog from the Animal class.
* Compile the classes.
* Create your own ClassLoader by extension of the standard ClassLoader.
* Load the classes Cat and Dog into an array or collection Animals by your own class loader and run the methods "Play", "Voice".
* Output data to console by log4j library (logger).

Note: Methods should just print a text message.