.class public final Li7/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll7/b;


# instance fields
.field public final synthetic a:I

.field public final b:Lz7/a;

.field public final c:Lz7/a;


# direct methods
.method public synthetic constructor <init>(Lz7/a;Lz7/a;I)V
    .locals 0

    .line 1
    iput p3, p0, Li7/W;->a:I

    iput-object p1, p0, Li7/W;->b:Lz7/a;

    iput-object p2, p0, Li7/W;->c:Lz7/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Li7/W;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li7/W;->b:Lz7/a;

    .line 7
    .line 8
    invoke-interface {v0}, Lz7/a;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lm7/o;

    .line 13
    .line 14
    iget-object v1, p0, Li7/W;->c:Lz7/a;

    .line 15
    .line 16
    invoke-interface {v1}, Lz7/a;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lm7/o;

    .line 21
    .line 22
    new-instance v2, Lm7/j;

    .line 23
    .line 24
    invoke-direct {v2, v0, v1}, Lm7/j;-><init>(Lm7/o;Lm7/o;)V

    .line 25
    .line 26
    .line 27
    return-object v2

    .line 28
    :pswitch_0
    iget-object v0, p0, Li7/W;->b:Lz7/a;

    .line 29
    .line 30
    invoke-interface {v0}, Lz7/a;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Li7/e0;

    .line 35
    .line 36
    iget-object v1, p0, Li7/W;->c:Lz7/a;

    .line 37
    .line 38
    invoke-interface {v1}, Lz7/a;->get()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Li7/f0;

    .line 43
    .line 44
    new-instance v2, Li7/V;

    .line 45
    .line 46
    invoke-direct {v2, v0, v1}, Li7/V;-><init>(Li7/e0;Li7/f0;)V

    .line 47
    .line 48
    .line 49
    return-object v2

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
