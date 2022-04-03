package com.yongjincompany.kotlingrammer.data

import com.yongjincompany.kotlingrammer.R

object DataProvider {

    val kg =
        KG(
            id = 1,
            title = "Val, Var",
            important = "필수적인",
            Level = 1,
            description = "val은 상수, 즉 초기화 이후 변하지 않는 값으로 불변임을 의미한다.\nvar은 초기화 이후 변할 수 있는 값으로 가변임을 의미한다.",
            KotlinImageId = R.drawable.valvar
        )

    val kgList = listOf(
        kg,
        KG(
            id = 2,
            title = "Any",
            important = "알면좋은",
            Level = 1,
            description = "모든 타입이 상속받는 최상위에 있는 타입이다.\n제네릭 타입으로 Any를 사용하면 어떤 객체를 집어넣든 모든 타입이 들어갈 수 있게 된다.",
            KotlinImageId = R.drawable.any
        )
    )
}