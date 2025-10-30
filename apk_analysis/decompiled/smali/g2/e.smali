.class public final synthetic Lg2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ2/M;
.implements Lq5/h;


# instance fields
.field public final synthetic a:Lcom/anilab/android/ui/player/PlayerActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/anilab/android/ui/player/PlayerActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg2/e;->a:Lcom/anilab/android/ui/player/PlayerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public f(Lcom/google/android/material/chip/ChipGroup;Ljava/util/ArrayList;)V
    .locals 3

    .line 1
    sget p1, Lcom/anilab/android/ui/player/PlayerActivity;->w0:I

    .line 2
    .line 3
    invoke-static {p2}, LB7/k;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Integer;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iget-object p2, p0, Lg2/e;->a:Lcom/anilab/android/ui/player/PlayerActivity;

    .line 16
    .line 17
    invoke-virtual {p2}, Lcom/anilab/android/ui/player/PlayerActivity;->d0()Lg2/a0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p2}, Lcom/anilab/android/ui/player/PlayerActivity;->Z()Lj3/r0;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {v1}, Lj3/r0;->T()J

    .line 26
    .line 27
    .line 28
    move-result-wide v1

    .line 29
    invoke-virtual {v0, v1, v2, p1}, Lg2/a0;->g(JI)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-nez p1, :cond_0

    .line 34
    .line 35
    new-instance p1, LM1/D;

    .line 36
    .line 37
    const v0, 0x7f14017f

    .line 38
    .line 39
    .line 40
    invoke-direct {p1, v0}, LM1/D;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2, p1}, Lcom/anilab/android/ui/player/PlayerActivity;->f0(LM1/E;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method
