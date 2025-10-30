.class public final synthetic Ld2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Ld2/g;->a:I

    iput-object p1, p0, Ld2/g;->b:Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget p1, p0, Ld2/g;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ld2/g;->b:Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->y0()Ld2/K;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v0, v0, Ld2/K;->r:Lb8/H;

    .line 13
    .line 14
    iget-object v0, v0, Lb8/H;->a:Lb8/F;

    .line 15
    .line 16
    check-cast v0, Lb8/Q;

    .line 17
    .line 18
    invoke-virtual {v0}, Lb8/Q;->h()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lcom/anilab/domain/model/Movie;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object v0, v0, Lcom/anilab/domain/model/Movie;->e:Ljava/lang/String;

    .line 27
    .line 28
    const-string v1, "fullDetail"

    .line 29
    .line 30
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    new-instance v1, Ld2/A;

    .line 34
    .line 35
    invoke-direct {v1, v0}, Ld2/A;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v1}, LM1/n;->j0(Lu0/D;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void

    .line 42
    :pswitch_0
    iget-object p1, p0, Ld2/g;->b:Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->y0()Ld2/K;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v0, v0, Ld2/K;->r:Lb8/H;

    .line 49
    .line 50
    iget-object v0, v0, Lb8/H;->a:Lb8/F;

    .line 51
    .line 52
    check-cast v0, Lb8/Q;

    .line 53
    .line 54
    invoke-virtual {v0}, Lb8/Q;->h()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Lcom/anilab/domain/model/Movie;

    .line 59
    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    iget-object v0, v0, Lcom/anilab/domain/model/Movie;->e:Ljava/lang/String;

    .line 63
    .line 64
    const-string v1, "fullDetail"

    .line 65
    .line 66
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    new-instance v1, Ld2/A;

    .line 70
    .line 71
    invoke-direct {v1, v0}, Ld2/A;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v1}, LM1/n;->j0(Lu0/D;)V

    .line 75
    .line 76
    .line 77
    :cond_1
    return-void

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
