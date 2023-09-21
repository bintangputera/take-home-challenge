package com.bintangpoetra.takehomechallenge.presentation.driver

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bintangpoetra.takehomechallenge.data.driver.model.DriverItem
import com.bintangpoetra.takehomechallenge.databinding.DriverItemBinding

class DriverAdapter(
    private val driverList: List<DriverItem>,
    private val onClick: (DriverItem) -> Unit
): RecyclerView.Adapter<DriverAdapter.DriverViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DriverViewHolder {
        val binding = DriverItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DriverViewHolder(binding)
    }

    override fun getItemCount(): Int = driverList.size

    override fun onBindViewHolder(holder: DriverViewHolder, position: Int) {
        holder.bind(driverList[position])
    }

    inner class DriverViewHolder(private val binding: DriverItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(driverItem: DriverItem) {
            binding.tvDriverName.text = driverItem.name

            binding.root.setOnClickListener {
                onClick.invoke(driverItem)
            }
        }
    }

}