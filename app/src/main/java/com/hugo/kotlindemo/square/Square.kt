package com.hugo.kotlindemo.square

class Square() : Rectangle(), Polygon {
    // 编译器要求覆盖 draw()：
    override fun draw() {
        super<Rectangle>.draw() // 调用 Rectangle.draw()
        super<Polygon>.draw() // 调用 Polygon.draw()
    }

    private val size: Int = 0
    val isEmpty: Boolean
        get() = this.size == 0
    var stringRepresentation: String
        get() = this.toString()
        set(value) {
            setDataFromString(value) // 解析字符串并赋值给其他属性
        }

    fun setDataFromString(value: String) {
        stringRepresentation = value
    }

    var setterVisibility: String = "abc"
        private set // 此 setter 是私有的并且有默认实现

    var counter = 0 // 注意：这个初始器直接为幕后字段赋值
        set(value) {
            if (value >= 0) field = value
        }

    private var _table: Map<String, Int>? = null
    public val table: Map<String, Int>
        get() {
            if (_table == null) {
                _table = HashMap() // 类型参数已推断出
            }
            return _table ?: throw AssertionError("Set to null by another thread")
        }
}