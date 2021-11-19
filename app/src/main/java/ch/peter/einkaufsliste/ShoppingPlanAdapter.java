package ch.peter.einkaufsliste;

import androidx.recyclerview.widget.RecyclerView;

import ch.peter.einkaufsliste.databinding.RecyclerViewShoppingPlanBinding;

public class ShoppingPlanAdapter extends RecyclerView.Adapter<ShoppingPlanAdapter.ViewHolder>()
{
    inner class ViewHolder(val binding extends RecyclerViewShoppingPlanBinding) extends RecyclerView.ViewHolder(binding.root)
}