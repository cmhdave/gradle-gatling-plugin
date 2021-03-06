package com.github.cmhdave.gradle.plugins

/**
 *
 */
class GatlingPluginExtension {

    /**
     *
     */
    String scenario

    /**
     *
     */
    List scenarios

    /**
     * this will allow verbose output during the build
     */
    boolean verbose

    /**
     * Allow the ability to override the Gatling tool version in the case that it is upgraded and this is not
     */
    String toolVersion = GatlingPlugin.GATLING_VERSION

    /**
     * allows users to set SystemProperties for the spawned gatling exec tasks
     */
    Map systemProperties

    protected List get_scenarios() {
        scenarios?: scenario? [scenario]: null
    }

    protected void verifySettings() {
        if(scenario && scenarios) {
            throw new GatlingPluginConfigurationException('Should not define both gatling.scenario and gatling.scenarios')
        }
    }
}

