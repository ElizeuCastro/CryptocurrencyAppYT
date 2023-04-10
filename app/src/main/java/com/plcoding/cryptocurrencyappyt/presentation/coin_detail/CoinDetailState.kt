package com.plcoding.cryptocurrencyappyt.presentation.coin_detail

import com.plcoding.cryptocurrencyappyt.domain.model.Coin
import com.plcoding.cryptocurrencyappyt.domain.model.CoinDetail

class CoinDetailState(
    val isLoading: Boolean = false,
    val coins: CoinDetail = emptyList(),
    val error: String = ""
)
