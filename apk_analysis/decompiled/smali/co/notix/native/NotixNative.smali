.class public interface abstract Lco/notix/native/NotixNative;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/notix/native/NotixNative$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lco/notix/native/NotixNative$Companion;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lco/notix/native/NotixNative$Companion;->$$INSTANCE:Lco/notix/native/NotixNative$Companion;

    sput-object v0, Lco/notix/native/NotixNative;->Companion:Lco/notix/native/NotixNative$Companion;

    return-void
.end method


# virtual methods
.method public abstract click(Lco/notix/native/NativeData;)V
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method

.method public abstract createLoader(J)Lco/notix/native/NativeLoader;
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method

.method public abstract createLoader(JLco/notix/domain/RequestVars;)Lco/notix/native/NativeLoader;
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method

.method public abstract createLoader(JLco/notix/domain/RequestVars;Ljava/lang/Integer;)Lco/notix/native/NativeLoader;
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method

.method public abstract createLoader(JLjava/lang/Integer;)Lco/notix/native/NativeLoader;
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method

.method public abstract trackImpression(Lco/notix/native/NativeData;)V
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method
