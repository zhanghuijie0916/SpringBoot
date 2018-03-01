var a = 3

var b = function (x,y) {
    document.writeln(x+y)
   return x+y
}

var p = {
    ID : 12,
  walk : function () {
      for(var i=0;i<10;i++){
          document.write(i)
      }
  }
}

/**
 * 循环遍历数组array中的每一个元素
 * @param array
 * @param func
 */
var each = function (array,func) {
    for (var index in array){
        func.call(null,index,array[index])
    }
}

/**
 * 同上
 * @param array
 * @param func
 */
var showArray = function (array,func) {
    each.apply(this,arguments)
}


/**
 * 一个function等价于四个东西 <=> 函数、对象、方法、类.
 *
 * 定义一个javascript函数时，实质上也得到了一个同名的类，
 * 而且该函数就是该类的构造器。
 * @param name
 * @param age
 * @constructor
 */
function Person(name,age) {
    this.name = name;
    this.age = age;
}

/**
 * Javascript是一门动态语言，不但可以为对象动态的增加属性和方法，
 * 而且可以为类增加属性和方法。
 */
Person.prototype.show = function () {
    document.writeln("name="+this.name+",age="+this.age)
}


