package com.example.newsapp.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.paging.compose.LazyPagingItems
import com.example.newsapp.domain.model.Article
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.newsapp.R
import com.example.newsapp.presentation.Dimens.MediumPadding1

@Composable
fun HomeScreen(
    articles: LazyPagingItems<Article>,
    navigate: (String) -> Unit
) {
    val titles by remember {
        derivedStateOf {
            if (articles.itemCount > 10) {
                articles.itemSnapshotList.items
                    .slice(IntRange(start = 0, endInclusive = 9))
                    .joinToString(separator = " \uD83d\uDFE5 ") { it.title }
            } else {
                ""
            }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = MediumPadding1)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_logo),
            contentDescription = null,
            modifier = Modifier
                .width(150.dp)
                .height(30.dp)
                .padding(horizontal = MediumPadding1)
        )
        
        Spacer(modifier = Modifier.height(MediumPadding1))
    }
}