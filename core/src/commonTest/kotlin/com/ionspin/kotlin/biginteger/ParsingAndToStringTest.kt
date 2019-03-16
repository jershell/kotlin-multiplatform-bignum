/*
 *    Copyright 2019 Ugljesa Jovanovic
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 */

package com.ionspin.kotlin.biginteger

import kotlin.random.Random
import kotlin.test.Test
import kotlin.test.assertTrue

/**
 * Created by Ugljesa Jovanovic
 * ugljesa.jovanovic@ionspin.com
 * on 16-Mar-3/16/19
 */
class ParsingAndToStringTest {
    val seed = 1
    val random = Random(1)

    @Test
    fun testParsing() {
        parsingSingleTest("1234" , 10)
    }

    fun parsingSingleTest(textNumber : String, base : Int) {
        assertTrue {
            val parsed = BigInteger.parseString(textNumber, base)
            val printed = parsed.toString(base)
            print(printed)


            textNumber == printed
        }
    }
}