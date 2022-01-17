package top.lanscarlos.skyflight.internal

import taboolib.platform.type.BukkitProxyEvent

object LifeCycleEvent {

    class Load : BukkitProxyEvent() {
        override val allowCancelled: Boolean
            get() = false
    }

    class Enable : BukkitProxyEvent() {
        override val allowCancelled: Boolean
            get() = false
    }

    class Active : BukkitProxyEvent() {
        override val allowCancelled: Boolean
            get() = false
    }

    class Reload : BukkitProxyEvent() {
        override val allowCancelled: Boolean
            get() = false
    }

    class Disable : BukkitProxyEvent() {
        override val allowCancelled: Boolean
            get() = false
    }

}