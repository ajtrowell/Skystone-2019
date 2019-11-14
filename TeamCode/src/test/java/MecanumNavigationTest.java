import com.google.common.truth.Truth;
import static com.google.common.truth.Truth.assertThat;

import org.firstinspires.ftc.teamcode.hardware.Dimensions;
import org.junit.Before;
import org.junit.Test;


import org.firstinspires.ftc.teamcode.hardware.MecanumDrive;
import org.firstinspires.ftc.teamcode.hardware.MainHardware;
import com.ftc16626.missioncontrol.math.Vector2;
import com.ftc16626.missioncontrol.math.kinematics.Kinematics;
import com.ftc16626.missioncontrol.math.kinematics.KinematicsIntegrator;



public class MecanumNavigationTest {

  double encoderTicksPerRotation = 386.3 * 2;
  double wheelRadius = 100 / 2;
  public final Dimensions dimensionsDriveTrain = new Dimensions(198.125, 336, 50);
  double length = dimensionsDriveTrain.getLength();
  double width = dimensionsDriveTrain.getWidth();

  Kinematics kinematics;


  @Before
  void initializeBeforeEachTest() {
    kinematics = new Kinematics(length / 2, width / 2,wheelRadius);
  }

  @Test
  void forwardDriveTest() {

//    double[] motion = kinematics.mecanumDrive(
//        motorVelFrontLeft, motorVelFrontRight,
//        motorVelBackLeft, motorVelBackRight
//    );


  }


}
