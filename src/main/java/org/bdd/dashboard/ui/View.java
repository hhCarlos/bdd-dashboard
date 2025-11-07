package org.bdd.dashboard.ui;

public enum View {
    LOGIN("login"),
    REGISTER("register"),
    FORGOT_PASSWORD("forgot"),
    DASHBOARD("dashboard");

    private final String key;

    View(String key) {
        this.key = key;
    }

    public String key() {
        return key;
    }
}
