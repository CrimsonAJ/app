.class public final Lu4/E;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lu4/d;


# direct methods
.method public constructor <init>(Lu4/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu4/E;->a:Lu4/d;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method


# virtual methods
.method public final a()V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p0, Lu4/E;->a:Lu4/d;

    .line 4
    .line 5
    iget-object v3, v2, Lu4/d;->e:Lu4/q;

    .line 6
    .line 7
    if-nez v3, :cond_0

    .line 8
    .line 9
    goto :goto_3

    .line 10
    :cond_0
    :try_start_0
    iget-object v3, v2, Lu4/d;->j:Lv4/h;

    .line 11
    .line 12
    if-eqz v3, :cond_1

    .line 13
    .line 14
    invoke-virtual {v3}, Lv4/h;->s()V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception v3

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    iget-object v3, v2, Lu4/d;->e:Lu4/q;

    .line 21
    .line 22
    check-cast v3, Lu4/o;

    .line 23
    .line 24
    invoke-virtual {v3}, LS4/a;->Q()Landroid/os/Parcel;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    sget v5, Lcom/google/android/gms/internal/cast/C;->a:I

    .line 29
    .line 30
    invoke-virtual {v4, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v4, v0}, LS4/a;->g1(Landroid/os/Parcel;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    goto :goto_2

    .line 37
    :goto_1
    sget-object v4, Lu4/d;->m:Ly4/b;

    .line 38
    .line 39
    const-class v5, Lu4/q;

    .line 40
    .line 41
    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    const/4 v6, 0x2

    .line 46
    new-array v6, v6, [Ljava/lang/Object;

    .line 47
    .line 48
    const-string v7, "onConnected"

    .line 49
    .line 50
    aput-object v7, v6, v1

    .line 51
    .line 52
    aput-object v5, v6, v0

    .line 53
    .line 54
    const-string v0, "Unable to call %s on %s."

    .line 55
    .line 56
    invoke-virtual {v4, v3, v0, v6}, Ly4/b;->a(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :goto_2
    iget-object v0, v2, Lu4/d;->l:Lcom/google/android/gms/internal/cast/H1;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    new-instance v1, LA3/E;

    .line 64
    .line 65
    const/4 v2, 0x3

    .line 66
    const/16 v3, 0xa

    .line 67
    .line 68
    invoke-direct {v1, v2, v3}, LA3/E;-><init>(II)V

    .line 69
    .line 70
    .line 71
    new-instance v2, Lcom/google/android/gms/internal/cast/D;

    .line 72
    .line 73
    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/cast/D;-><init>(LA3/E;)V

    .line 74
    .line 75
    .line 76
    iget-object v0, v0, Lcom/google/android/gms/internal/cast/H1;->a:LY2/r;

    .line 77
    .line 78
    invoke-static {v0, v2}, LY2/r;->W(LY2/r;Lcom/google/android/gms/internal/cast/D;)V

    .line 79
    .line 80
    .line 81
    :cond_2
    :goto_3
    return-void
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
