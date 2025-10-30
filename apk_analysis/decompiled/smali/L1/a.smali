.class public final LL1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Li/h;


# direct methods
.method public synthetic constructor <init>(Li/h;I)V
    .locals 0

    .line 1
    iput p2, p0, LL1/a;->a:I

    iput-object p1, p0, LL1/a;->b:Li/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget v0, p0, LL1/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LL1/a;->b:Li/h;

    .line 7
    .line 8
    invoke-virtual {v0}, Li/h;->R()Li/l;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Li/l;->a()V

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, Ld/l;->e:Lcom/google/android/gms/internal/measurement/C1;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/C1;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, LN0/f;

    .line 20
    .line 21
    const-string v2, "androidx:appcompat"

    .line 22
    .line 23
    invoke-virtual {v0, v2}, LN0/f;->c(Ljava/lang/String;)Landroid/os/Bundle;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Li/l;->c()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    iget-object v0, p0, LL1/a;->b:Li/h;

    .line 31
    .line 32
    check-cast v0, Lcom/anilab/android/ui/player/PlayerActivity;

    .line 33
    .line 34
    iget-boolean v1, v0, Lg2/c;->C:Z

    .line 35
    .line 36
    if-nez v1, :cond_0

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    iput-boolean v1, v0, Lg2/c;->C:Z

    .line 40
    .line 41
    invoke-virtual {v0}, Lg2/c;->e()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lg2/J;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    :cond_0
    return-void

    .line 51
    :pswitch_1
    iget-object v0, p0, LL1/a;->b:Li/h;

    .line 52
    .line 53
    check-cast v0, Lcom/anilab/android/ui/activity/MainActivity;

    .line 54
    .line 55
    iget-boolean v1, v0, Lcom/anilab/android/ui/activity/MainActivity;->X:Z

    .line 56
    .line 57
    if-nez v1, :cond_1

    .line 58
    .line 59
    const/4 v1, 0x1

    .line 60
    iput-boolean v1, v0, Lcom/anilab/android/ui/activity/MainActivity;->X:Z

    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/anilab/android/ui/activity/MainActivity;->e()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, LL1/p;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    :cond_1
    return-void

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 74
    .line 75
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
