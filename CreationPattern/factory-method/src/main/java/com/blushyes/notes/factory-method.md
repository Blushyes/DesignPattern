# 关于工厂方法
+ 工厂方法实际上是为了避免简单工厂的一些繁琐的if-else语句而对每个实体类都创建一个具体的工厂的方法。  
+ 比如AnimalFactory要创建一个Dog，并不是在AnimalFactory的内部的创建方法进行判断然后进行创建以及处理细节，而是首先定义一个AnimalFactory的接口，然后通过一个DogFactory的类来对Dog进行创建，而DogFactory只需要去实现AnimalFactory这个接口就行。