package com.blushyes;

import com.blushyes.impl.*;

public class DecoratorPatternDemo {
    public static void main( String[] args ) {
        //现有三个公司均要对A、B、C三种服务进行相同的专属于它们公司的扩展
        //若直接采用继承的方式，则需要定义大量子类
        //而采用装饰器模式则可以很好的避免这个问题
        //其核心思想是创建相关装饰器用于动态扩展功能，每个装饰器可以扩展不同功能
        //想要给哪个类扩展某种功能就用对应类型的装饰器“装饰”它
        //实现扩展功能与扩展对象解耦合，扩展功能并不依赖于某一特定扩展对象
        //若新增 服务/新的扩展功能 只需要新增一个 服务实现类/装饰器 即可

        //假设我想对A服务进行公司1的扩展
        //那么直接将A服务公司1的装饰器
        ServiceDecorator decorator = new Expansion1(new AService());
        //得到的装饰器即为公司1对A服务进行扩展之后的服务
        //因为装饰器类实现了服务类，也属于服务
        //现在创建一个使用服务的客户端
        Client client = new Client();
        //让它去使用扩展后的功能
        client.useService(decorator);

        //其他也同理
        decorator = new Expansion2(new AService());
        client.useService(decorator);
        decorator = new Expansion3(new BService());
        client.useService(decorator);
    }
}
