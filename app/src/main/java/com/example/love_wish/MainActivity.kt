package com.example.love_wish

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.love_wish.portfolio.*
import com.example.love_wish.ui.theme.LovewishTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LovewishTheme {

                Scaffold(topBar = {
                    TopAppBar(backgroundColor = Color(0x9500D9FF), elevation = 2.dp) {
                        Text(text = "Birthday Wishes")

                    }
                }) {
                    Appinterface()
                }

            }
        }
    }
}


@Preview
@Composable
fun Appinterface() {


    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        color = MaterialTheme.colors.background
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(210.dp)
                    .padding(15.dp),
                shape = RoundedCornerShape(corner = CornerSize(9.dp)),
                elevation = 22.dp, backgroundColor = Color(0x6BFF00E5),
            ) {
                Row(
                    modifier = Modifier
                        .padding(5.dp)

                        .padding(15.dp)
                ) {
                    Spacer(modifier = Modifier.size(50.dp))
                    Column(
                        modifier = Modifier
                            .padding(7.dp)
                            .align(alignment = Alignment.CenterVertically)
                    ) {

                        Text(
                            text = "❤️ Happy Birthday ❤️",
                            style = MaterialTheme.typography.body1,
                            fontWeight = FontWeight.ExtraBold
                        )
                    }
                }

            }
            Spacer(modifier = Modifier
                .size(10.dp)
                .size(8.dp)
                .width(5.dp))
            Divider(modifier = Modifier.padding(10.dp))
          //  Spacer(modifier = Modifier.size(10.dp))
            Row(modifier = Modifier.align(alignment = Alignment.CenterHorizontally), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
                Spacer(modifier = Modifier.size(7.dp))
                Text(text = "I want to thank you, for being the most loving and caring person in this entire world.No one understands me better than you,Wishing you a very very Happy Birthday to you 🥰😍",
                    modifier = Modifier,
                    style = MaterialTheme.typography.h6,
                    fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.size(5.dp))


            }

            CreateBizCard()




        }


    }


}
@Composable
fun CreateBizCard() {
    val buttonClickedState = remember {
        mutableStateOf(false)
    }
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Card(
            modifier = Modifier
                .width(200.dp)
                .height(390.dp)
                .padding(12.dp),
            backgroundColor = Color.White,
            shape = RoundedCornerShape(corner = CornerSize(10.dp)),
            elevation = 5.dp
        ) {
            Column(
                modifier = Modifier.height(150.dp), verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Divider(modifier = Modifier.padding(3.dp, 3.dp), Color.Gray, thickness = 2.dp)



                Button(onClick = {
                    buttonClickedState.value = !buttonClickedState.value
                }) {
                    Text(text = "Memories", style = MaterialTheme.typography.button)

                }
                if (buttonClickedState.value) {
                    Content()
                } else {
                    Box() {

                    }
                }
            }


        }
    }

}
@Composable
fun Content(){
    Box(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth()
        .padding(3.dp)){
        Surface(modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(3.dp),
            shape = RoundedCornerShape(corner = CornerSize(5.dp)),
            border = BorderStroke(width = 1.dp, color = Color.Unspecified)
        ) {
            Portfolios(data = listOf("Happy Birthday"))

        }

    }


}



@Composable
fun Createimage(modifier: Modifier = Modifier) {
                Surface(
                    modifier = Modifier
                        .size(200.dp)
                        .padding(5.dp),
                    shape = RectangleShape, border = BorderStroke(width = 0.5.dp, Color.LightGray),
                    elevation = 4.dp,
                    color = MaterialTheme.colors.onSurface.copy(alpha = 0.5f)
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.sample),
                        contentDescription = "Profile",
                        modifier = Modifier.size(300.dp),
//                contentScale = ContentScale.Crop
                    )

                }
            }
@Composable
fun Createimagee(modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier
            .size(200.dp)
            .padding(5.dp),
        shape = RectangleShape, border = BorderStroke(width = 0.5.dp, Color.LightGray),
        elevation = 4.dp,
        color = MaterialTheme.colors.onSurface.copy(alpha = 0.5f)
    )
    {
        Image(
            painter = painterResource(id = R.drawable.sample),
            contentDescription = "Picture Of Adarsh",
            modifier = Modifier.size(300.dp),
//                contentScale = ContentScale.Crop
        )

    }
}


@Composable
fun Createimageee(modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier
            .size(200.dp)
            .padding(5.dp),
        shape = RectangleShape, border = BorderStroke(width = 0.5.dp, Color.LightGray),
        elevation = 4.dp,
        color = MaterialTheme.colors.onSurface.copy(alpha = 0.5f)
    )
    {
        Image(
            painter = painterResource(id = R.drawable.sample),
            contentDescription = "Profi",
            modifier = Modifier.size(300.dp),
//                contentScale = ContentScale.Crop
        )
    }
}

@Composable
fun Createimageeee(modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier
            .size(200.dp)
            .padding(5.dp),
        shape = RectangleShape, border = BorderStroke(width = 0.5.dp, Color.LightGray),
        elevation = 4.dp,
        color = MaterialTheme.colors.onSurface.copy(alpha = 0.5f)
    )
    {
        Image(
            painter = painterResource(id = R.drawable.sample),
            contentDescription = "Profl",
            modifier = Modifier.size(300.dp),
//                contentScale = ContentScale.Crop
        )
    }
}

@Composable
fun Createimageeeee(modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier
            .size(200.dp)
            .padding(5.dp),
        shape = RectangleShape, border = BorderStroke(width = 0.5.dp, Color.LightGray),
        elevation = 4.dp,
        color = MaterialTheme.colors.onSurface.copy(alpha = 0.5f)
    )
    {
        Image(
            painter = painterResource(id = R.drawable.sample),
            contentDescription = "PicAdarsh",
            modifier = Modifier.size(300.dp),
//                contentScale = ContentScale.Crop
        )
    }
}


@Composable
fun Createimageeeeee(modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier
            .size(200.dp)
            .padding(5.dp),
        shape = RectangleShape, border = BorderStroke(width = 0.5.dp, Color.LightGray),
        elevation = 4.dp,
        color = MaterialTheme.colors.onSurface.copy(alpha = 0.5f)
    )
    {
        Image(
            painter = painterResource(id = R.drawable.sample),
            contentDescription = "Pr",
            modifier = Modifier.size(300.dp),
//                contentScale = ContentScale.Crop
        )
    }
}
    






@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LovewishTheme {

    }
}
