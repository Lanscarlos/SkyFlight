package top.lanscarlos.skyflight

import taboolib.common.platform.Plugin
import taboolib.common.platform.function.getDataFolder
import taboolib.common.platform.function.info
import taboolib.common5.FileWatcher
import taboolib.module.configuration.Config
import taboolib.module.configuration.Configuration
import top.lanscarlos.skyflight.internal.LifeCycleEvent
import top.lanscarlos.skyflight.utils.addListener
import java.io.File

object SkyFlight : Plugin() {

    @Config
    lateinit var conf: Configuration
        private set

    override fun onLoad() {
        LifeCycleEvent.Load().call()
    }

    override fun onEnable() {
        File(getDataFolder(), "config.yml").addListener(false) {
            conf.reload()
        }
        LifeCycleEvent.Enable().call()
        info("Successfully running ExamplePlugin!")
    }

    override fun onActive() {
        LifeCycleEvent.Active().call()
    }

    override fun onDisable() {
        LifeCycleEvent.Disable().call()
    }

}