import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.myapplication.ui.theme.*
import kotlinx.coroutines.launch


//class HomeView : ViewModel() {
//    //首页选中项的索引
//    private val _position = MutableLiveData(-1)
//
//    //动画状态
//    val animalBoolean = mutableStateOf(true)
//    var position: LiveData<Int> = _position
//
//    //选中索引数据刷新
//    var bootomType = true
//    fun positionChanged(selectedIndex: Int) {
//        _position.value = selectedIndex
//    }
//}


@OptIn(InternalComposeApi::class, androidx.compose.material.ExperimentalMaterialApi::class)
@Composable
fun homePage(navController: NavController) {
    // 脚手架状态
    val scaffoldState = rememberScaffoldState()
    // 协程
    val coroutineScope = rememberCoroutineScope()
//    val buttonState =
    val openDrawer: () -> Unit = { coroutineScope.launch { scaffoldState.drawerState.open() } }
//    val openLogin: () -> Unit = { coroutineScope.launch {  } }
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "HomePage", color = Color.White, fontWeight = FontWeight.Bold)
                },
                navigationIcon = {
                    IconButton(onClick = openDrawer, modifier = Modifier.size(60.dp)) {
                        Icon(imageVector = Icons.Filled.List, contentDescription = null)
                    }
                },
                actions = {
                    IconButton(onClick = { navController.navigate("loginPage")}, modifier = Modifier.size(60.dp)) {
                        Icon(imageVector = Icons.Filled.Share, contentDescription = null)
                    }
                },
                backgroundColor = Pink200
            )
        },
        drawerContent = { // 抽屉内容
            drawerContentPage()
        }
//        ,
//        bottomBar = { BottomNavigationTwo(HomeView()) }
    ) {
        val vm: MainViewModel = viewModel()
            ProjectList(vm)
//        ListStudy(vm = vm)
    }
}


//@Composable
//fun ButtonBar(){
//    BottomAppBar(
//
//    )
//}