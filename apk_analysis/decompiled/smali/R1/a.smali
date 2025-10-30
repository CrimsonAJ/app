.class public final synthetic LR1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO7/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/anilab/android/ui/download/DownloadFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/anilab/android/ui/download/DownloadFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, LR1/a;->a:I

    iput-object p1, p0, LR1/a;->b:Lcom/anilab/android/ui/download/DownloadFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, LR1/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR1/a;->b:Lcom/anilab/android/ui/download/DownloadFragment;

    .line 7
    .line 8
    invoke-virtual {v0}, LM1/g;->m0()LW/g;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, LJ1/g;

    .line 13
    .line 14
    iget-object v0, v0, LJ1/g;->C:Landroidx/recyclerview/widget/RecyclerView;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->h0(I)V

    .line 18
    .line 19
    .line 20
    sget-object v0, LA7/n;->a:LA7/n;

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    iget-object v0, p0, LR1/a;->b:Lcom/anilab/android/ui/download/DownloadFragment;

    .line 24
    .line 25
    invoke-virtual {v0}, LR1/D;->m()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    new-instance v1, LR1/E;

    .line 32
    .line 33
    const v2, 0x7f0d0083

    .line 34
    .line 35
    .line 36
    invoke-direct {v1, v0, v2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 v1, 0x0

    .line 41
    :goto_0
    return-object v1

    .line 42
    :pswitch_1
    new-instance v0, LR1/C;

    .line 43
    .line 44
    iget-object v1, p0, LR1/a;->b:Lcom/anilab/android/ui/download/DownloadFragment;

    .line 45
    .line 46
    iget-object v2, v1, Lcom/anilab/android/ui/download/DownloadFragment;->T0:Lb5/G1;

    .line 47
    .line 48
    invoke-virtual {v2}, Lb5/G1;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, LR1/s;

    .line 53
    .line 54
    iget-object v2, v2, LR1/s;->a:Lcom/anilab/domain/model/Movie;

    .line 55
    .line 56
    new-instance v3, LB7/a;

    .line 57
    .line 58
    const/4 v4, 0x3

    .line 59
    invoke-direct {v3, v4, v1}, LB7/a;-><init>(ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    new-instance v4, LR1/a;

    .line 63
    .line 64
    const/4 v5, 0x2

    .line 65
    invoke-direct {v4, v1, v5}, LR1/a;-><init>(Lcom/anilab/android/ui/download/DownloadFragment;I)V

    .line 66
    .line 67
    .line 68
    iget-object v1, v2, Lcom/anilab/domain/model/Movie;->b:Ljava/lang/String;

    .line 69
    .line 70
    invoke-direct {v0, v1, v3, v4}, LR1/C;-><init>(Ljava/lang/String;LB7/a;LR1/a;)V

    .line 71
    .line 72
    .line 73
    return-object v0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
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
