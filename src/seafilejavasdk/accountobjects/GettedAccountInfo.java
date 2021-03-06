package seafilejavasdk.accountobjects;

import java.time.Instant;

import static java.time.temporal.ChronoUnit.MICROS;

/**
 * @author liudongyu1119@outlook.com
 * @version 1.5
 * @date 2019/04/17
 */
public class GettedAccountInfo extends CheckedAccountInfo {

    private boolean isStaff;
    private boolean isActive;
    private int id;
    private String createTime;

    public GettedAccountInfo(boolean isStaff, boolean isActive, int id, long createTime, long usage, long total, String email) {
        super(usage, total, email);
        this.isStaff = isStaff;
        this.isActive = isActive;
        this.id = id;
        this.createTime = Instant.EPOCH.plus(createTime, MICROS).toString();
    }

    public boolean isStaff() {
        return isStaff;
    }

    public boolean isActive() {
        return isActive;
    }

    public int getId() {
        return id;
    }

    public String getCreateTime() {
        return createTime;
    }
}
