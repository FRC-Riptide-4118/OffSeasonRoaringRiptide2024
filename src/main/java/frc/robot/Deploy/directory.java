import java.io.File;
import edu.wpi.first.wpilibj.Filesystem;
import swervelib.parser.SwerveParser;
import swervelib.SwerveDrive;

File swerveJsonDirectory=new File(Filesystem.getDeployDirectory(),"swerve");
SwerveDrive swerveDrive=new SwerveParser(swerveJsonDirectory).createSwerveDrive();