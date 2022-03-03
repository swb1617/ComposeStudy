package com.example.myapplication.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.paging.LoadState
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.itemsIndexed

@Composable
fun ListStudy(vm: MainViewModel){
    val vm: MainViewModel = viewModel()
    val scrollState = rememberLazyListState()
    LazyColumn(state = scrollState) {
        items(10){
            Row(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                StudyLayoutViews()
                Spacer(modifier = Modifier.padding(horizontal = 5.dp))
                StudyLayoutViews()
            }
        }

    }
}
@Composable
fun ProjectList(vm: MainViewModel) {
    val projects = vm.projects.collectAsLazyPagingItems()
    LazyColumn {
        itemsIndexed(projects) { _, project ->
            ProjectItem(project = project!!)
        }
    }
}
//    when (projects.loadState.refresh) {
//        is LoadState.NotLoading -> LazyColumn {
//            itemsIndexed(projects) { _, project ->
//                ProjectItem(project = project!!)
//            }
//            when (projects.loadState.append) {
//                is LoadState.NotLoading -> itemsIndexed(projects) { _, project ->
//                    ProjectItem(project = project!!)
//                }
//                is LoadState.Error -> item {
//                    Row(
//                        modifier = Modifier.fillMaxWidth().padding(8.dp),
//                        verticalAlignment = Alignment.CenterVertically,
//                        horizontalArrangement = Arrangement.Center,
//                    ){
//                        Button(onClick = {
//                            projects.retry()
//                        }) {
//                            Text(text = "重试")
//                        }
//                    }
//
//                }
//                LoadState.Loading -> item {
//                    LoadingPage()
//                }
//
//            }
//        }
//        is LoadState.Error -> ErrorPage { projects.refresh() }
//        LoadState.Loading -> LoadingPage()
//    }
//}
