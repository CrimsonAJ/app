.class public final synthetic Lcom/google/android/gms/internal/cast/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/android/gms/internal/cast/q;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/cast/q;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/google/android/gms/internal/cast/n;->a:I

    iput-object p1, p0, Lcom/google/android/gms/internal/cast/n;->b:Lcom/google/android/gms/internal/cast/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/cast/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/internal/cast/n;->b:Lcom/google/android/gms/internal/cast/q;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/cast/q;->p()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v0, p0, Lcom/google/android/gms/internal/cast/n;->b:Lcom/google/android/gms/internal/cast/q;

    .line 13
    .line 14
    iget-object v1, v0, Lcom/google/android/gms/internal/cast/q;->e:Lcom/google/android/gms/internal/cast/u;

    .line 15
    .line 16
    iget-object v2, v1, Lcom/google/android/gms/internal/cast/u;->b:Lt0/D;

    .line 17
    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    iget-object v2, v1, Lcom/google/android/gms/internal/cast/u;->a:Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {v2}, Lt0/D;->d(Landroid/content/Context;)Lt0/D;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iput-object v2, v1, Lcom/google/android/gms/internal/cast/u;->b:Lt0/D;

    .line 27
    .line 28
    :cond_0
    iget-object v1, v1, Lcom/google/android/gms/internal/cast/u;->b:Lt0/D;

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Lt0/D;->h(Lt0/x;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
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
