package com.example.love_wish.portfolio

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.love_wish.*


@Composable
fun Portfolios(data: List<String>) {
    LazyColumn{
        items(data){
                item ->
            Card(modifier = Modifier
                .padding(7.dp)
                .fillMaxHeight()
                .fillMaxWidth(), shape = RectangleShape,
                elevation = 3.dp){

                Column(modifier = Modifier
                    .padding(7.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                    Createimageeee(modifier = Modifier.size(200.dp))

                    Text(text = item, fontWeight = FontWeight.Light)
                    Text(text = "☺️", style = MaterialTheme.typography.body1)

                    Spacer(modifier = Modifier.size(10.dp))

                    Createimageee(modifier = Modifier.size(175.dp))

                    Text(text = item, fontWeight = FontWeight.Light)
                    Text(text = "🥰️", style = MaterialTheme.typography.body1)

                    Spacer(modifier = Modifier.size(10.dp))

                    Createimage(modifier = Modifier.size(200.dp))

                    Text(text = item, fontWeight = FontWeight.Light)
                    Text(text = "🤩️", style = MaterialTheme.typography.body1)

                    Spacer(modifier = Modifier.size(10.dp))

                    Createimagee(modifier = Modifier.size(150.dp))

                    Text(text = item, fontWeight = FontWeight.Light)
                    Text(text = "☺🥰", style = MaterialTheme.typography.body1)

                    Spacer(modifier = Modifier.size(10.dp))

                    Createimageeeee(modifier = Modifier.size(150.dp))

                    Text(text = item, fontWeight = FontWeight.Light)
                    Text(text = "❤️️", style = MaterialTheme.typography.body1)

                    Spacer(modifier = Modifier.size(10.dp))

                    Createimageeeeee(modifier = Modifier.size(150.dp))

                    Text(text = item, fontWeight = FontWeight.Light)
                    Text(text = "💜️", style = MaterialTheme.typography.body1)

                    Spacer(modifier = Modifier.size(10.dp))


                }

            }
        }
    }

}