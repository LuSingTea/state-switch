package io.github.wechaty.io.github.wechaty.status

import io.github.wechaty.status.StateEnum

@FunctionalInterface
interface StateSwitchListener {
    fun handler(state: StateEnum)
}
