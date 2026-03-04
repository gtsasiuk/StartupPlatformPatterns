package com.startup.patterns.creational.singleton;

public class PlatformConfig {
    private volatile static PlatformConfig config = null;

    private final EnvProfile envProfile;
    private final String globalAPIKey;
    private final String defaultCurrency;
    private final int maxTeamSize;
    private final String version;

    private PlatformConfig(EnvProfile envProfile, String globalAPIKey, String defaultCurrency, int maxTeamSize, String version) {
        this.envProfile = envProfile;
        this.globalAPIKey = globalAPIKey;
        this.defaultCurrency = defaultCurrency;
        this.maxTeamSize = maxTeamSize;
        this.version = version;
    }

    public static PlatformConfig getInstance(EnvProfile envProfile,
                                             String globalAPIKey,
                                             String defaultCurrency,
                                             int maxTeamSize,
                                             String version) {
        if (config == null) {
            synchronized (PlatformConfig.class) {
                if (config == null) {
                    config = new PlatformConfig(envProfile, globalAPIKey, defaultCurrency, maxTeamSize, version);
                }
            }
        }
        return config;
    }

    public String showConfig() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlatformConfig\n");
        sb.append("  envProfile=").append(envProfile).append("\n");
        sb.append("  globalAPIKey=").append(globalAPIKey).append("\n");
        sb.append("  defaultCurrency=").append(defaultCurrency).append("\n");
        sb.append("  maxTeamSize=").append(maxTeamSize).append("\n");
        sb.append("  version=").append(version).append("\n");
        return sb.toString();
    }
}
