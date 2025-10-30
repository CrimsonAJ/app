.class public final Lb5/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/android/gms/internal/measurement/L;

.field public final synthetic c:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/L;I)V
    .locals 0

    .line 1
    iput p3, p0, Lb5/t0;->a:I

    iput-object p2, p0, Lb5/t0;->b:Lcom/google/android/gms/internal/measurement/L;

    iput-object p1, p0, Lb5/t0;->c:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Lb5/t0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb5/t0;->c:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 7
    .line 8
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->e:Lb5/n0;

    .line 9
    .line 10
    iget-object v1, v1, Lb5/n0;->l:Lb5/P1;

    .line 11
    .line 12
    invoke-static {v1}, Lb5/n0;->d(LD/n;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->e:Lb5/n0;

    .line 16
    .line 17
    iget-object v2, v0, Lb5/n0;->B:Ljava/lang/Boolean;

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    iget-object v0, v0, Lb5/n0;->B:Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    :goto_0
    iget-object v2, p0, Lb5/t0;->b:Lcom/google/android/gms/internal/measurement/L;

    .line 33
    .line 34
    invoke-virtual {v1, v2, v0}, Lb5/P1;->H0(Lcom/google/android/gms/internal/measurement/L;Z)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_0
    iget-object v0, p0, Lb5/t0;->c:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 39
    .line 40
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->e:Lb5/n0;

    .line 41
    .line 42
    invoke-virtual {v0}, Lb5/n0;->m()Lb5/m1;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v2}, Lb5/A;->l0()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Lb5/B;->m0()V

    .line 50
    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    invoke-virtual {v2, v0}, Lb5/m1;->z0(Z)Lb5/Q1;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    new-instance v1, LA4/j;

    .line 58
    .line 59
    iget-object v4, p0, Lb5/t0;->b:Lcom/google/android/gms/internal/measurement/L;

    .line 60
    .line 61
    const/16 v5, 0xb

    .line 62
    .line 63
    const/4 v6, 0x0

    .line 64
    invoke-direct/range {v1 .. v6}, LA4/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v1}, Lb5/m1;->C0(Ljava/lang/Runnable;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
