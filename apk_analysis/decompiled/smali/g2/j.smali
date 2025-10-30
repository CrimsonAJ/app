.class public final synthetic Lg2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LJ1/c;


# direct methods
.method public synthetic constructor <init>(LJ1/c;I)V
    .locals 0

    .line 1
    iput p2, p0, Lg2/j;->a:I

    iput-object p1, p0, Lg2/j;->b:LJ1/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    const/4 p1, 0x0

    .line 2
    const/16 v0, 0x8

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    iget-object v2, p0, Lg2/j;->b:LJ1/c;

    .line 6
    .line 7
    iget v3, p0, Lg2/j;->a:I

    .line 8
    .line 9
    packed-switch v3, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget p1, Lcom/anilab/android/ui/player/PlayerActivity;->w0:I

    .line 13
    .line 14
    iget-object p1, v2, LJ1/c;->N:Lcom/anilab/exoplayer/StyledPlayerView;

    .line 15
    .line 16
    invoke-virtual {p1, v1}, Lcom/anilab/exoplayer/StyledPlayerView;->setUseController(Z)V

    .line 17
    .line 18
    .line 19
    iget-object p1, v2, LJ1/c;->N:Lcom/anilab/exoplayer/StyledPlayerView;

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/anilab/exoplayer/StyledPlayerView;->f()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {p1, v1}, Lcom/anilab/exoplayer/StyledPlayerView;->g(Z)V

    .line 26
    .line 27
    .line 28
    iget-object p1, v2, LJ1/c;->B:Landroidx/appcompat/widget/AppCompatImageView;

    .line 29
    .line 30
    const-string v1, "buttonUnlock"

    .line 31
    .line 32
    invoke-static {p1, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_0
    sget p1, Lcom/anilab/android/ui/player/PlayerActivity;->w0:I

    .line 40
    .line 41
    iget-object p1, v2, LJ1/c;->M:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 42
    .line 43
    const-string v1, "layoutSubSync"

    .line 44
    .line 45
    invoke-static {p1, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_1
    sget v0, Lcom/anilab/android/ui/player/PlayerActivity;->w0:I

    .line 53
    .line 54
    iget-object v0, v2, LJ1/c;->N:Lcom/anilab/exoplayer/StyledPlayerView;

    .line 55
    .line 56
    invoke-virtual {v0, p1}, Lcom/anilab/exoplayer/StyledPlayerView;->setUseController(Z)V

    .line 57
    .line 58
    .line 59
    iget-object v0, v2, LJ1/c;->B:Landroidx/appcompat/widget/AppCompatImageView;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    new-instance v3, Lg2/l;

    .line 69
    .line 70
    invoke-direct {v3, v2, p1}, Lg2/l;-><init>(LJ1/c;I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v3}, Landroid/view/ViewPropertyAnimator;->withStartAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    new-instance v0, Lg2/l;

    .line 78
    .line 79
    invoke-direct {v0, v2, v1}, Lg2/l;-><init>(LJ1/c;I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    const-wide/16 v0, 0x7d0

    .line 87
    .line 88
    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
