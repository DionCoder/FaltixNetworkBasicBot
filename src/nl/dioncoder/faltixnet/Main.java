package nl.dioncoder.faltixnet;

import org.bukkit.plugin.java.JavaPlugin;

/*
* FaltixNetwork
* Gamemode DallStreet
*
* Basic Start for the Jr Devs
* Cannot be used by bystanders due to missing info.
*/

public class Main extends JavaPlugin {

    /*
     * Enable the plugin (not needed with this plugin, all is standard in the Bot FaltixNetwork plugin)
     */
    @Override
    public void onEnable() {
        registerBot();

        registerCommands();
        registerListeners();
    }

    /*
     * Disable the plugin
     */
    @Override
    public void onDisable() {
    }


    /*
     * Register Methods
     */
    private void registerBot() {
    }

    private void registerListeners() {
    }

    private void registerCommands() {
    }
}
