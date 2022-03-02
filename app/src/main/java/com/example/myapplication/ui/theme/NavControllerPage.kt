import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ui.theme.loginPage

@Composable
fun ComposePage() {
    // 创建NavController
    val navController = rememberNavController()
//     用NavHost将NavController和导航图相关联，startDestination指定起始的可组合项
    NavHost(navController = navController,"loginPage" ){
        // 给FirstPage可组合项指定路径homePage
        composable("homePage") { homePage(navController) }
        // 给SecondPage可组合项指定路径
        composable("loginPage") { loginPage(navController) }
        // 给ThirdPage可组合项指定路径
//        composable("third_page") { ThirdPage(navController) }
    }
}



