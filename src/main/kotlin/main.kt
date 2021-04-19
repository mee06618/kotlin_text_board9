fun main() {

    var num: Int = 0
    print("회원 수 : ")
    num = readLine()!!.trim().toInt()

    println("${num}명의 회원정보를 입력합니다")

    var person = arrayOfNulls<Person>(num)

    for (i in 0 until num) {
        println(person.size)
        print("${i + 1}번째 회원의 이름 : ")
        var name: String = readLine()!!.trim().toString()
        print("${i + 1}번째 회원의 나이 : ")
        var age: Int = readLine()!!.trim().toInt()
        print("${i + 1}번째 회원의 성별(M/W) : ")
        var gender: String = readLine()!!.trim().toString()
        gender = if (gender == "M") "남자"
        else "여자"
        var info:Person = Person(i + 1, name, age, gender)
        person.set(i,info)
        print("${i + 1}번 회원의 정보가 등록되었습니다")
    }

    for (i in 0 until num) {
        print(person[i])
    }

}


data class Person(
    var num: Int = 0,
    var name: String = "",
    var age: Int = 0,
    var gender: String = ""
) {

    fun setInfo(num: Int, name: String, age: Int, gender: String) {
        this.num = num
        this.name = name
        this.age = age
        this.gender = gender

    }

    override fun toString(): String {
        return "$num  /  $name  /  $age  /  $gender"
    }

}