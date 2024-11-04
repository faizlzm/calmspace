// ArticleViewModel.kt
package com.bangunsubuh.calmspace.feature.article

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State
import com.bangunsubuh.calmspace.R
import com.bangunsubuh.calmspace.model.ArticleModel

class ArticleViewModel : ViewModel() {
    private val _selectedTab = mutableStateOf(0)
    val selectedTab: State<Int> = _selectedTab

    private val _searchQuery = mutableStateOf("")
    val searchQuery: State<String> = _searchQuery

    private val _articles = listOf(
        ArticleModel(
            id = 1,
            image = R.drawable.img_ocpd,
            title = "Mengenal Obsessive-Compulsive Personality Disorder (OCPD)",
            content = "OCPD adalah gangguan kepribadian yang ditandai dengan preokupasi berlebihan terhadap keteraturan, perfeksionisme, dan kontrol mental/interpersonal...",
            category = "Artikel",
            date = "2024-03-01",
            author = "Dr. Sarah Johnson"
        ),
        ArticleModel(
            id = 2,
            image = R.drawable.img_anxiety,
            title = "Mengenal Anxiety",
            content = "Anxiety atau kecemasan adalah respons alami tubuh terhadap stres, namun dapat menjadi masalah ketika terjadi secara berlebihan...",
            category = "Artikel",
            date = "2024-03-05",
            author = "Dr. Michael Chen"
        ),
        ArticleModel(
            id = 3,
            image = R.drawable.img_depression,
            title = "Mengenal Depresi",
            content = "Depresi adalah gangguan suasana hati yang menyebabkan perasaan sedih berkepanjangan dan hilangnya minat dalam aktivitas sehari-hari...",
            category = "Artikel",
            date = "2024-03-10",
            author = "Dr. Emily Rodriguez"
        ),
        ArticleModel(
            id = 4,
            image = R.drawable.img_bipolar,
            title = "Mengenal Bipolar",
            content = "Gangguan bipolar adalah kondisi kesehatan mental yang menyebabkan perubahan ekstrem dalam suasana hati, energi, dan kemampuan berpikir...",
            category = "Artikel",
            date = "2024-03-15",
            author = "Dr. David Kim"
        )
    )

    val filteredArticles: List<ArticleModel>
        get() {
            var filtered = _articles

            filtered = when (_selectedTab.value) {
                0 -> filtered
                1 -> filtered.filter { it.category == "Artikel" }
                2 -> filtered.filter { it.category == "Video" }
                else -> filtered
            }

            if (_searchQuery.value.isNotEmpty()) {
                filtered = filtered.filter {
                    it.title.contains(_searchQuery.value, ignoreCase = true) ||
                            it.content.contains(_searchQuery.value, ignoreCase = true)
                }
            }

            return filtered
        }

    fun setSelectedTab(index: Int) {
        _selectedTab.value = index
    }

    fun setSearchQuery(query: String) {
        _searchQuery.value = query
    }
}