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

Task 1. (20 points)

Design and implement code that will introduce:

* java.lang.OutOfMemoryError: Java heap space. You can use different data structures. Do not tune heap size.
* java.lang.OutOfMemoryError: Java heap space. Create big objects continuously and make them stay in memory. Do not use arrays or collections.
* java.lang.OutOfMemoryError: Metaspace. Load classes continuously and make them stay in memory.
* java.lang.StackOverflowError. Use recursive methods. Don’t tune stack size.
* java.lang.StackOverflowError. Do not use recursive methods. Don’t tune stack size.