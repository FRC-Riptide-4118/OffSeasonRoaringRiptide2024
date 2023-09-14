package frc.robot.subsystems;

import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SwerveDrive extends SubsystemBase {

    /** Creates a new ExampleSubsystem. 
     * @return */
    public void SwerveDriveKinematics() {}
  
    public final double L = 46;
    public final double W = 46;


    public void drive (double x1, double y1, double x2) {
        double r = Math.sqrt ((L * L) + (W * W));
        y1 *= -1;

        double a = x1 - x2 * (L/r);
        double b = x1 + x2 * (L/r);
        double c = y1 - x2 * (W/r);
        double d = y1 + x2 * (W/r);

        double backRightSpeed    = Math.sqrt ((a * a) + (d * d));
        double backLeftSpeed     = Math.sqrt ((a * a) + (c * c));
        double frontRightSpeed   = Math.sqrt ((b * b) + (d * d));
        double frontLeftSpeed    = Math.sqrt ((b * b) + (c * c));

    }

}

