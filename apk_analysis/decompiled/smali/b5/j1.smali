.class public final Lb5/j1;
.super Lb5/o;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Lb5/m1;


# direct methods
.method public synthetic constructor <init>(Lb5/m1;Lb5/n0;I)V
    .locals 0

    .line 1
    iput p3, p0, Lb5/j1;->e:I

    iput-object p1, p0, Lb5/j1;->f:Lb5/m1;

    invoke-direct {p0, p2}, Lb5/o;-><init>(Lb5/y0;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 3

    .line 1
    iget v0, p0, Lb5/j1;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb5/j1;->f:Lb5/m1;

    .line 7
    .line 8
    iget-object v0, v0, LD/n;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lb5/n0;

    .line 11
    .line 12
    iget-object v0, v0, Lb5/n0;->i:Lb5/V;

    .line 13
    .line 14
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 15
    .line 16
    .line 17
    const-string v1, "Tasks have been queued for a long time"

    .line 18
    .line 19
    iget-object v0, v0, Lb5/V;->i:Lb5/T;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lb5/T;->b(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_0
    iget-object v0, p0, Lb5/j1;->f:Lb5/m1;

    .line 26
    .line 27
    invoke-virtual {v0}, Lb5/A;->l0()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lb5/m1;->v0()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object v1, v0, LD/n;->a:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Lb5/n0;

    .line 40
    .line 41
    iget-object v1, v1, Lb5/n0;->i:Lb5/V;

    .line 42
    .line 43
    invoke-static {v1}, Lb5/n0;->f(Lb5/x0;)V

    .line 44
    .line 45
    .line 46
    const-string v2, "Inactivity, disconnecting from the service"

    .line 47
    .line 48
    iget-object v1, v1, Lb5/V;->n:Lb5/T;

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Lb5/T;->b(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lb5/m1;->q0()V

    .line 54
    .line 55
    .line 56
    :goto_0
    return-void

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
