package com.vlad1m1r.lemniscate.utils

import com.google.common.truth.Truth.assertThat
import com.vlad1m1r.lemniscate.base.models.Point
import org.junit.Test

class CurveUtilsTest {

    val point = Point(5f, 0f, 1f, 10f)

    @Test
    fun returnPoint_whenPointIsNotInHole() {
        assertThat(CurveUtils.checkPointForHole(point, 0.2f, 10f)).isSameInstanceAs(point)
    }

    @Test
    fun returnNull_whenPointIsInHole() {
        assertThat(CurveUtils.checkPointForHole(point, 5.0f, 10f)).isNull()
    }

    @Test
    fun returnNull_whenPointIsNull() {
        assertThat(CurveUtils.checkPointForHole(null, 0.2f, 10f)).isNull()
    }
}
