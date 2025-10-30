.class public final synthetic Lt0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lt0/a;->a:I

    iput-object p2, p0, Lt0/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lt0/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt0/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lt0/A;

    .line 9
    .line 10
    invoke-virtual {v0}, Lt0/A;->a()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    const/4 v0, -0x1

    .line 15
    iget-object v1, p0, Lt0/a;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lt0/i;

    .line 18
    .line 19
    iput v0, v1, Lt0/i;->n:I

    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    iget-object v0, p0, Lt0/a;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lt0/e;

    .line 25
    .line 26
    invoke-virtual {v0}, Lt0/e;->l()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 32
.end method
