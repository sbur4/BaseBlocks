package GOFdesignPatterns.beh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class MyTemplate {
    String userName;
    String password;

    MyTemplate() {
    }

    abstract boolean logIn(String userName, String password);

    abstract boolean sendData(byte[] data);

    abstract void logOut();
}

class Facebook extends MyTemplate {
    public Facebook(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public boolean logIn(String userName, String password) {
        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }
        return true;
    }

    public boolean sendData(byte[] data) {
        boolean messagePosted = true;
        if (messagePosted) {
            return true;
        } else {
            return false;
        }
    }

    public void logOut() {
        System.out.println("User: '" + userName + "' was logged out from Facebook");
    }
}

class Twitter extends MyTemplate {
    public Twitter(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public boolean logIn(String userName, String password) {
        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }
        return true;
    }

    public boolean sendData(byte[] data) {
        boolean messagePosted = true;
        if (messagePosted) {
            return true;
        } else {
            return false;
        }
    }

    public void logOut() {
        System.out.println("User: '" + userName + "' was logged out from Facebook");
    }
}

class Demo {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        MyTemplate network = null;
        String userName = reader.readLine();
        String password = reader.readLine();

        String message = reader.readLine();

        int choice = Integer.parseInt(reader.readLine());

        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
    }
}