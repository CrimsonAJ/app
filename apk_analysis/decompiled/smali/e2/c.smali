.class public final synthetic Le2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/anilab/android/ui/myList/MyListActionBottomSheet;


# direct methods
.method public synthetic constructor <init>(Lcom/anilab/android/ui/myList/MyListActionBottomSheet;I)V
    .locals 0

    .line 1
    iput p2, p0, Le2/c;->a:I

    iput-object p1, p0, Le2/c;->b:Lcom/anilab/android/ui/myList/MyListActionBottomSheet;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget p1, p0, Le2/c;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, LG0/L;

    .line 7
    .line 8
    const/4 v0, 0x6

    .line 9
    invoke-direct {p1, v0}, LG0/L;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Le2/c;->b:Lcom/anilab/android/ui/myList/MyListActionBottomSheet;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lcom/anilab/android/ui/myList/MyListActionBottomSheet;->t0(LO7/l;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lm5/g;->l0()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    new-instance p1, LG0/L;

    .line 22
    .line 23
    const/4 v0, 0x5

    .line 24
    invoke-direct {p1, v0}, LG0/L;-><init>(I)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Le2/c;->b:Lcom/anilab/android/ui/myList/MyListActionBottomSheet;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Lcom/anilab/android/ui/myList/MyListActionBottomSheet;->t0(LO7/l;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lm5/g;->l0()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 38
.end method
