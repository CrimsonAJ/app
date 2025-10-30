.class public final Lg2/I;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements LO7/a;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Lcom/anilab/android/ui/player/PlayerActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/anilab/android/ui/player/PlayerActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lg2/I;->d:I

    iput-object p1, p0, Lg2/I;->e:Lcom/anilab/android/ui/player/PlayerActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/i;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lg2/I;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg2/I;->e:Lcom/anilab/android/ui/player/PlayerActivity;

    .line 7
    .line 8
    invoke-virtual {v0}, Ld/l;->p()Lm0/d;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0

    .line 13
    :pswitch_0
    iget-object v0, p0, Lg2/I;->e:Lcom/anilab/android/ui/player/PlayerActivity;

    .line 14
    .line 15
    invoke-virtual {v0}, Ld/l;->u()Landroidx/lifecycle/j0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    :pswitch_1
    iget-object v0, p0, Lg2/I;->e:Lcom/anilab/android/ui/player/PlayerActivity;

    .line 21
    .line 22
    invoke-virtual {v0}, Lg2/c;->j()Landroidx/lifecycle/h0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method
