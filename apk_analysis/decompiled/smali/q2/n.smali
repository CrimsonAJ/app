.class public final Lq2/n;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements LO7/a;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Lcom/anilab/android/ui/update/UpdateFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/anilab/android/ui/update/UpdateFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Lq2/n;->d:I

    iput-object p1, p0, Lq2/n;->e:Lcom/anilab/android/ui/update/UpdateFragment;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/i;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lq2/n;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq2/n;->e:Lcom/anilab/android/ui/update/UpdateFragment;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    iget-object v0, p0, Lq2/n;->e:Lcom/anilab/android/ui/update/UpdateFragment;

    .line 10
    .line 11
    iget-object v1, v0, Li0/v;->f:Landroid/os/Bundle;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    new-instance v2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v3, "Fragment "

    .line 21
    .line 22
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v0, " has null arguments"

    .line 29
    .line 30
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v1

    .line 41
    :pswitch_1
    iget-object v0, p0, Lq2/n;->e:Lcom/anilab/android/ui/update/UpdateFragment;

    .line 42
    .line 43
    invoke-virtual {v0}, Li0/v;->W()Li0/y;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ld/l;->j()Landroidx/lifecycle/h0;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v1, "requireActivity().defaultViewModelProviderFactory"

    .line 52
    .line 53
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v0

    .line 57
    :pswitch_2
    iget-object v0, p0, Lq2/n;->e:Lcom/anilab/android/ui/update/UpdateFragment;

    .line 58
    .line 59
    invoke-virtual {v0}, Li0/v;->W()Li0/y;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Ld/l;->p()Lm0/d;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    return-object v0

    .line 68
    :pswitch_3
    iget-object v0, p0, Lq2/n;->e:Lcom/anilab/android/ui/update/UpdateFragment;

    .line 69
    .line 70
    invoke-virtual {v0}, Li0/v;->W()Li0/y;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Ld/l;->u()Landroidx/lifecycle/j0;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    const-string v1, "requireActivity().viewModelStore"

    .line 79
    .line 80
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-object v0

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method
