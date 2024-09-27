package week03.cinetickets.models.enums;

public enum UserRole {
    CUSTOMER("1 - CLIENTE"),
    EMPLOYEE("2 - FUNCIONÁRIO");

    String userType;

    UserRole(String userType) {
        this.userType = userType;
    }

    public static UserRole userTypeSelect(String userType) {
        UserRole[] var1 = values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            UserRole userRole = var1[var3];
            if (userRole.getUserType().equals(userType)) {
                return userRole;
            }
        }

        return null;
    }

    public String getUserType() {
        return userType;
    }
}
