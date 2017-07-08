package android.sharedoffices.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Alin on 08/07/2017.
 */

public class User implements Parcelable{

    private String firstName;
    private String lastName;
    private int age;

    protected User(Parcel in) {
        firstName = in.readString();
        lastName = in.readString();
        age = in.readInt();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    @Override
    public int describeContents() {
        return CONTENTS_FILE_DESCRIPTOR;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(firstName);
        dest.writeString(lastName);
        dest.writeInt(age);
    }
}
